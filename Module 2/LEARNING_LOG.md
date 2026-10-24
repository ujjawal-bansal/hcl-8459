# HCL Learning Log

## Day 10 — MVC Structure (2026-10-22)

- Learned how an MVC-style Spring Boot application separates responsibilities across controller, model, service, and repository layers.
- Started the HCLHRMS employee module with an `Employee` model, REST endpoints, service operations, and an in-memory repository implementation.
- Request flow: `EmployeeController` → `EmployeeServiceImp` → `EmpRepoImp`, using `Employee` as the data model.

Project files are in [`HCLHRMS/`](../HCLHRMS/).

## Day 11 — Employee CRUD and Spring Boot Practice (2026-10-24)

- Extended the `HCLHRMS` employee API with update and delete endpoints.
- Built a separate `HRMSDatabase` Spring Boot CRUD practice project using Spring Web, Spring Data JPA, H2, and OpenAPI.
- Implemented the employee entity, repository, service, and REST controller layers for create, update, and delete operations.
- Added Infosys Java 11 Essentials and Beyond Basics certification records.

Project files are in [`HCLHRMS/`](../HCLHRMS/) and [`HRMSDatabase/`](../HRMSDatabase/).
