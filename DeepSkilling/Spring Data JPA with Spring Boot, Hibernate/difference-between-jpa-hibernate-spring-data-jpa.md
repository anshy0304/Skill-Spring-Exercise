# Difference Between JPA, Hibernate, and Spring Data JPA

## JPA

JPA stands for Java Persistence API. It is a specification, not a tool or framework by itself.

It defines the rules and interfaces for mapping Java objects to database tables and performing persistence operations like saving, updating, finding, and deleting data.

Examples of JPA concepts:

- `@Entity`
- `@Table`
- `@Id`
- `EntityManager`
- `@OneToMany`
- `@ManyToOne`

JPA tells you what should be available, but it does not provide the actual implementation.

## Hibernate

Hibernate is a popular implementation of JPA.

It is a framework that provides the actual code behind the JPA specification. When you use Hibernate, you are using JPA through a concrete provider.

Hibernate offers:

- Object-relational mapping
- Query support with HQL and JPQL
- Transaction handling
- Lazy loading
- Caching
- Schema generation features

In short, Hibernate is one way to use JPA.

## Spring Data JPA

Spring Data JPA is a higher-level abstraction built on top of JPA.

It reduces boilerplate code by giving ready-made repository support for common database operations.

Instead of writing full DAO code, you can extend interfaces like `JpaRepository`, `CrudRepository`, or `PagingAndSortingRepository`.

Spring Data JPA provides:

- Repository abstraction
- Automatic implementation of repository methods
- Query method creation from method names
- Integration with Spring transactions
- Pagination and sorting support

Spring Data JPA still uses a JPA provider such as Hibernate underneath.

## Relationship Between Them

The three are related like this:

- JPA is the specification
- Hibernate is an implementation of that specification
- Spring Data JPA is a Spring module that simplifies working with JPA

## Simple Example

If you want to fetch all countries:

- In plain JPA, you may use `EntityManager` and write more code
- In Hibernate, you use Hibernate APIs or JPA APIs backed by Hibernate
- In Spring Data JPA, you can simply call `countryRepository.findAll()`

## Quick Comparison

- JPA: defines the rules
- Hibernate: executes the rules
- Spring Data JPA: makes database access easier on top of JPA

## Conclusion

Use JPA as the standard, Hibernate as the implementation, and Spring Data JPA when you want faster development with less boilerplate in Spring applications.
