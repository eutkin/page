FROM adoptopenjdk:11-jre-hotspot

WORKDIR /application

ENV JAVA_OPTS -XX:+UnlockExperimentalVMOptions \
              -XX:+UseContainerSupport \
              -Djava.util.concurrent.ForkJoinPool.common.parallelism=2 \
              -Djava.security.egd=file:/dev/./urandom

ENV USER_JAVA_OPTS ""

COPY target/*.jar /application/app.jar
ENTRYPOINT java $JAVA_OPTS $USER_JAVA_OPTS -jar app.jar

EXPOSE 8080