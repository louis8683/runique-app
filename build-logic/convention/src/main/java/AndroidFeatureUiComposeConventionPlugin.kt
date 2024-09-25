import com.android.build.api.dsl.LibraryExtension
import com.louislu.convention.ExtensionType
import com.louislu.convention.addUiLayerDependencies
import com.louislu.convention.configureAndroidCompose
import com.louislu.convention.configureBuildTypes
import com.louislu.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidFeatureUiComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("runique.android.library.compose")
            }

            dependencies {
                addUiLayerDependencies(target)
            }
        }
    }
}