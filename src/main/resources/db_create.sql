DROP TABLE IF EXISTS public.counters;
DROP TABLE IF EXISTS public.documents;
DROP TABLE IF EXISTS public.apartments;
DROP TABLE IF EXISTS public.users;
DROP TABLE IF EXISTS public.apartment_types;
DROP TABLE IF EXISTS public.user_types;

CREATE TABLE user_types (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL
);

CREATE TABLE apartment_types (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL
);

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  email TEXT UNIQUE NOT NULL,
  password TEXT NOT NULL,
  user_type_id INTEGER NOT NULL,
  FOREIGN KEY (user_type_id) REFERENCES user_types(id)
);

CREATE TABLE apartments (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  address TEXT NOT NULL,
  apartment_type_id INTEGER NOT NULL,
  user_id INTEGER NOT NULL,
  FOREIGN KEY (apartment_type_id) REFERENCES apartment_types(id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE documents (
  id SERIAL PRIMARY KEY,
  owner_id INTEGER NOT NULL,
  order_id INTEGER NOT NULL,
  apartment_id INTEGER NOT NULL,
  FOREIGN KEY (owner_id) REFERENCES users(id),
  FOREIGN KEY (order_id) REFERENCES users(id),
  FOREIGN KEY (apartment_id) REFERENCES apartments(id)
);

CREATE TABLE counters (
  id SERIAL PRIMARY KEY,
  document_id INTEGER NOT NULL,
  hot_water TEXT NOT NULL,
  cold_water TEXT NOT NULL,
  electricity TEXT NOT NULL,
  gas TEXT NOT NULL,
  FOREIGN KEY (document_id) REFERENCES documents(id)
);