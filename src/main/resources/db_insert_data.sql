-- user_types
INSERT INTO user_types (name) VALUES
  ('owner'),
  ('order');

-- users
INSERT INTO users (name, email, password, user_type_id) VALUES
  ('John Doe', 'johndoe@example.com', 'password', 1),
  ('Jane Smith', 'janesmith@example.com', 'password', 2),
  ('Cap Smooth', 'cap@example.com', 'password', 2),
  ('Bob Johnson', 'bobjohnson@example.com', 'password', 1);

-- apartment_types
INSERT INTO apartment_types (name) VALUES
  ('house'),
  ('flat');

-- apartments
INSERT INTO apartments (name, address, apartment_type_id, user_id) VALUES
  ('Apartment 1', '123 Main St', 1, 1),
  ('Apartment 2', '456 Oak St', 2, 1),
  ('Apartment 3', '789 Elm St', 1, 4),
  ('Apartment 4', '1010 Pine St', 2, 4);

-- documents
INSERT INTO documents (owner_id, order_id, apartment_id) VALUES
  (1, 2, 1),
  (4, 2, 3),
  (4, 3, 4),
  (1, 3, 2);

-- counters
INSERT INTO counters (document_id, hot_water, cold_water, electricity, gas) VALUES
  (1, '205', '348', '1005', '124'),
  (2, '105', '248', '675', '42'),
  (3, '235', '378', '484', '56'),
  (4, '125', '348', '642', '44');