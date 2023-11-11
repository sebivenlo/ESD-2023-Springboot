FROM gradle:jdk19 AS build
WORKDIR /workspace/app

COPY . /workspace/app
RUN gradle clean build
RUN mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*-SNAPSHOT.jar)

FROM eclipse-temurin:19-jre-jammy

VOLUME /tmp
# See: https://spring.io/guides/topicals/spring-boot-docker/
ARG DEPENDENCY=/workspace/app/build/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.esdworkshop.EsdWorkshopApplication"]


