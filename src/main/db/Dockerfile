FROM postgres
EXPOSE 5432
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_DB students
COPY schema.sql /docker-entrypoint-initdb.d/