[LOG_STASH_HOME_DIR]/bin/logstash -f config/mysql-import.conf

wget http://localhost:9200/index-3/_search?pretty=true

