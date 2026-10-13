package com.abes.library.repository;

import com.abes.library.model.*;
import com.abes.library.exception.*;
import java.util.*;

public class LibraryRepository {
    private final Map<String, LibraryItem> items = new LinkedHashMap<>();
    private final Map<String, Member> members = new LinkedHashMap<>();
    private final Map<String, Queue<Member>> waitlists = new HashMap<>();

    public void addItem(LibraryItem item) {
        if (items.containsKey(item.getItemId())) {
            throw new IllegalArgumentException("Item ID already exists");
        }

        if (item instanceof Book) {
            String isbn = ((Book) item).getIsbn();

            for (LibraryItem existing : items.values()) {
                if (existing instanceof Book && ((Book) existing).getIsbn().equalsIgnoreCase(isbn)) {
                    throw new IllegalArgumentException("A book with this ISBN already exists");
                }
            }
        }

        items.put(item.getItemId(), item);
    }

    public void addMember(Member member) {
        if (members.containsKey(member.getMemberId())) {
            throw new IllegalArgumentException("Member ID already exists");
        }

        members.put(member.getMemberId(), member);
    }

    public LibraryItem getItem(String id) throws ItemNotFoundException {
        LibraryItem item = items.get(id);

        if (item == null) {
            throw new ItemNotFoundException("Item not found: " + id);
        }

        return item;
    }

    public Member getMember(String id) throws MemberNotFoundException {
        Member member = members.get(id);

        if (member == null) {
            throw new MemberNotFoundException("Member not found: " + id);
        }

        return member;
    }

    public Collection<LibraryItem> getItems() {
        return Collections.unmodifiableCollection(items.values());
    }

    public Collection<Member> getMembers() {
        return Collections.unmodifiableCollection(members.values());
    }

    public List<LibraryItem> search(String term) {
        String query = term.toLowerCase(Locale.ROOT);
        List<LibraryItem> result = new ArrayList<>();

        for (LibraryItem item : items.values()) {
            boolean idMatches = item.getItemId().toLowerCase(Locale.ROOT).contains(query);
            boolean titleMatches = item.getTitle().toLowerCase(Locale.ROOT).contains(query);
            boolean authorMatches = false;

            if (item instanceof Book) {
                Book book = (Book) item;
                authorMatches = book.getAuthor().toLowerCase(Locale.ROOT).contains(query);
            }

            if (idMatches || titleMatches || authorMatches) {
                result.add(item);
            }
        }

        return result;
    }

    public void addToWaitlist(String itemId, Member member) throws ItemNotFoundException {
        getItem(itemId);

        Queue<Member> queue = waitlists.get(itemId);

        if (queue == null) {
            queue = new LinkedList<>();
            waitlists.put(itemId, queue);
        }

        if (!queue.contains(member)) {
            queue.offer(member);
        }
    }

    public Member notifyNext(String itemId) {
        Queue<Member> queue = waitlists.get(itemId);

        if (queue == null) {
            return null;
        }

        Member next = queue.poll();

        if (queue.isEmpty()) {
            waitlists.remove(itemId);
        }

        return next;
    }

    public Map<String, Queue<Member>> getWaitlists() {
        return Collections.unmodifiableMap(waitlists);
    }
}
