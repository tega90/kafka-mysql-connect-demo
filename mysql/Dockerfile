FROM mysql:5.7

ENV MYSQL_ALLOW_EMPTY_PASSWORD true
ENV MYSQL_DATABASE trafficvance
ENV MYSQL_USER user
ENV MYSQL_PASSWORD password

COPY init-scripts /docker-entrypoint-initdb.d
COPY mysql.cnf /etc/mysql/conf.d/mysql.cnf

RUN chown -R mysql:mysql /docker-entrypoint-initdb.d &&\
    chown mysql:mysql /etc/mysql/conf.d/mysql.cnf && \
    mkdir -p /mysql/binlogs && \
    chown -R mysql:mysql /mysql/binlogs