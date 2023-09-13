plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish") // Apply the maven-publish plugin
    id("kotlin-android")
}

android {
    namespace = "com.omaradev.testsdk"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            consumerProguardFiles("proguard-rules.pro")
            consumerProguardFiles("consumer-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(listOf("--release", "17")) // This is for Java language version 17
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    api("com.squareup.picasso:picasso:2.8")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "com.github.AhmedOmara14"
            artifactId = "android-demo-lib"
            version = "1.0"

            pom {
                description.set("DESCRIPTION")
            }
        }
    }
    repositories {
        mavenLocal()
    }
}
