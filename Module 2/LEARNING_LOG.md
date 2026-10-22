# HCL Learning Log

## Day 10 — MVC Structure (2026-10-22)

- Learned how an MVC-style Spring Boot application separates responsibilities across controller, model, service, and repository layers.
- Started the HCLHRMS employee module with an `Employee` model, REST endpoints, service operations, and an in-memory repository implementation.
- Request flow: `EmployeeController` → `EmployeeServiceImp` → `EmpRepoImp`, using `Employee` as the data model.

Project files are in [`HCLHRMS/`](../HCLHRMS/).
