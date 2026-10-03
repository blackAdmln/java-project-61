.DEFAULT_GOAL := run-dist

run: dep_update clean lint_check lint_apply build install run-dist

dep_update:
	./gradlew dependencyUpdates

clean:
	./gradlew clean

lint_check:
	-./gradlew spotlessCheck

lint_apply:
	./gradlew spotlessApply

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

