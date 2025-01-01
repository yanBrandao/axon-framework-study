plugins {
	alias(libs.plugins.kotlin.spring)
	alias(libs.plugins.kotlin.jvm)
}

group = "br.com.yantapajos"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(libs.spring.boot.starter)
	implementation(libs.kotlin.reflect)
	runtimeOnly(libs.h2)
	testImplementation(libs.spring.boot.starter.test)
	testImplementation(libs.junit)
	testImplementation(libs.junit.platform.launcher)
	testImplementation(libs.kotest.runner)
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
