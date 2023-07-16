create table users (
    id integer not null,
    created_at timestamp(6),
    email varchar(255) not null,
    first_name varchar(255) not null,
    is_active boolean,
    last_name varchar(255) not null,
    password varchar(255) not null,
    social_id varchar(255),
    social_type varchar(255),
    updated_at timestamp(6),
    username varchar(255),
    primary key (id)
)