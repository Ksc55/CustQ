

CREATE SEQUENCE IF NOT EXISTS public.authentication_user_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;
    


CREATE SEQUENCE IF NOT EXISTS public.group_table_group_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;


CREATE SEQUENCE IF NOT EXISTS public.organization_info_organization_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS public.otp_otp_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS public.register_table_register_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;
   
CREATE SEQUENCE IF NOT EXISTS public.sub_group_sub_group_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS public."userOrganization_user_id_seq"
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;


CREATE TABLE IF NOT EXISTS public.authentication
(
    first_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    user_role character varying(50) COLLATE pg_catalog."default",
    user_password character varying(255) COLLATE pg_catalog."default",
    user_email character varying(255) COLLATE pg_catalog."default",
    phone_number character varying(20) COLLATE pg_catalog."default",
    is_deleted boolean,
    user_id integer NOT NULL DEFAULT nextval('authentication_user_id_seq'::regclass),
    CONSTRAINT authentication_pkey PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS public.end_user
(
    user_id integer NOT NULL,
    queue_id integer,
    token_number integer,
    CONSTRAINT enduser_pkey PRIMARY KEY (user_id)
);


CREATE TABLE IF NOT EXISTS public.group_table
(
    organization_id integer,
    group_name character varying COLLATE pg_catalog."default",
    group_id integer NOT NULL DEFAULT nextval('group_table_group_id_seq'::regclass),
    CONSTRAINT group_pkey PRIMARY KEY (group_id)
);


CREATE TABLE IF NOT EXISTS public.organization_info
(
    organization_id bigint NOT NULL DEFAULT nextval('organization_info_organization_id_seq'::regclass),
    organization_name character varying COLLATE pg_catalog."default",
    CONSTRAINT organization_info_pkey PRIMARY KEY (organization_id)
);


CREATE TABLE IF NOT EXISTS public.organization_queue
(
    queue_id integer NOT NULL,
    organization_id integer,
    queue_name character varying(255) COLLATE pg_catalog."default",
    queue_size integer,
    group_id integer,
    sub_group_id integer,
    queue_start_time timestamp without time zone,
    queue_end_time timestamp without time zone,
    token_type character varying(50) COLLATE pg_catalog."default",
    queue_frequency integer,
    queue_status boolean,
    created_by character varying COLLATE pg_catalog."default",
    created_date time with time zone,
    modified_by character varying COLLATE pg_catalog."default",
    modified_date time with time zone,
    token_reset character varying COLLATE pg_catalog."default",
    CONSTRAINT organizationqueue_pkey PRIMARY KEY (queue_id)
);


CREATE TABLE IF NOT EXISTS public.otp
(
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    otp integer,
    is_used boolean,
    otp_id integer NOT NULL DEFAULT nextval('otp_otp_id_seq'::regclass),
    created_time timestamp without time zone DEFAULT (now())::date,
    expiration_time timestamp without time zone DEFAULT ((now())::date + '01:00:00'::interval),
    CONSTRAINT otp_pkey PRIMARY KEY (otp_id)
);


CREATE TABLE IF NOT EXISTS public.real_time_queue
(
    queue_id integer NOT NULL,
    current_token_number integer,
    highest_token_number integer,
    CONSTRAINT realtimequeue_pkey PRIMARY KEY (queue_id)
);



CREATE TABLE IF NOT EXISTS public.reason_table
(
    reason_id integer NOT NULL,
    queue_id integer,
    token_number integer,
    CONSTRAINT reasontable_pkey PRIMARY KEY (reason_id)
);


CREATE TABLE IF NOT EXISTS public.register_table
(
    first_name character varying COLLATE pg_catalog."default",
    last_name character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    phone_number bigint,
    password character varying COLLATE pg_catalog."default",
    organization_name character varying COLLATE pg_catalog."default",
    register_id integer NOT NULL DEFAULT nextval('register_table_register_id_seq'::regclass),
    created_time time without time zone,
    CONSTRAINT register_table_pkey PRIMARY KEY (register_id),
    CONSTRAINT "unique email" UNIQUE (email)
);


CREATE TABLE IF NOT EXISTS public.sub_group
(
    category_id integer,
    sub_group_name character varying COLLATE pg_catalog."default",
    sub_group_id integer NOT NULL DEFAULT nextval('sub_group_sub_group_id_seq'::regclass),
    CONSTRAINT sub_group_pkey PRIMARY KEY (sub_group_id)
);


CREATE TABLE IF NOT EXISTS public.user_organization
(
    user_id integer NOT NULL DEFAULT nextval('"userOrganization_user_id_seq"'::regclass),
    organization_id integer
);




