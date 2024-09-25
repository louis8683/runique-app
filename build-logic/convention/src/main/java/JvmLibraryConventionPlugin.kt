import com.android.build.api.dsl.LibraryExtension
import com.louislu.convention.ExtensionType
import com.louislu.convention.configureBuildTypes
import com.louislu.convention.configureKotlinAndroid
import com.louislu.convention.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJvm()
        }
    }
}