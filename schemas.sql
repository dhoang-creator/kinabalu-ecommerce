-- We need to formulate the data diagram of this REST API ->
-- Map out the data model in terms of the edge cases of alternative behaviour to the desired?

CREATE TABLE IF NOT EXISTS Users (
    user_id     UUID,
    full_name   VARCHAR(110),
    email       VARCHAR(110),
    password    VARCHAR(20),
    is_active   BOOLEAN
);