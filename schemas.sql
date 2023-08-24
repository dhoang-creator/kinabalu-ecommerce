-- We need to formulate the data diagram of this REST API ->
-- Map out the data model in terms of the edge cases of alternative behaviour to the desired?

CREATE TABLE IF NOT EXISTS users (
    email       VARCHAR(110),
    name        VARCHAR(110),
    id          UUID,
    password    VARCHAR(20)
);