# orm-learn

Spring Data JPA quick example for the `country` table.

## Database

Create the schema and sample rows before running the app:

```sql
create schema ormlearn;
use ormlearn;
create table country(co_code varchar(2) primary key, co_name varchar(50));
insert into country values ('IN', 'India');
insert into country values ('US', 'United States of America');
```
