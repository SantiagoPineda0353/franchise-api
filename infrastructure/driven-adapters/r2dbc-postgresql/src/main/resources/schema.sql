CREATE TABLE IF NOT EXISTS franchise (
    id   BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS branch (
    id           BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name         VARCHAR(100) NOT NULL,
    franchise_id BIGINT NOT NULL REFERENCES franchise (id) ON DELETE CASCADE,
    CONSTRAINT uk_branch_name UNIQUE (franchise_id, name)
);

CREATE TABLE IF NOT EXISTS product (
    id        BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    stock     INTEGER NOT NULL CHECK (stock >= 0),
    branch_id BIGINT NOT NULL REFERENCES branch (id) ON DELETE CASCADE,
    CONSTRAINT uk_product_name UNIQUE (branch_id, name)
);

CREATE INDEX IF NOT EXISTS idx_branch_franchise ON branch (franchise_id);
CREATE INDEX IF NOT EXISTS idx_product_branch ON product (branch_id);