plugins {
    id("com.android.application")

}

android {
    namespace = "com.example.proyectomeep"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.proyectomeep"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        exclude("META-INF/NOTICE.md") // Excluir el archivo duplicado
        exclude("META-INF/LICENSE.md")
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.facebook.android:facebook-login:17.0.0")
    implementation("com.facebook.android:facebook-android-sdk:13.0.0")
    implementation ("com.google.android.gms:play-services-auth:21.2.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.drawerlayout:drawerlayout:1.2.0")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")


    //circule image
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //animacion
    implementation("com.airbnb.android:lottie:3.4.0")
    implementation("com.github.bumptech.glide:glide:4.16.0")

    //BD
    implementation("com.loopj.android:android-async-http:1.4.9")
    implementation("com.android.volley:volley-cronet:1.2.1")
    implementation("com.google.android.gms:play-services-auth:21.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.google.android.gms:play-services-maps:18.1.0")

    implementation ("com.sun.mail:android-mail:1.6.7")
    implementation ("com.sun.mail:android-activation:1.6.7")


}