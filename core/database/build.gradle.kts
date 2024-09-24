plugins {
    alias(libs.plugins.runique.android.library)
}


android {
    namespace = "com.louislu.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}