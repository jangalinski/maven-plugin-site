package io.toolisticon.maven.plugin.site

import io.toolisticon.maven.plugin.site.GenerateSiteMojo.Companion.GOAL
import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_RESOURCES
import org.apache.maven.plugins.annotations.Mojo
import org.apache.maven.plugins.annotations.ResolutionScope.COMPILE_PLUS_RUNTIME

@Mojo(name = GOAL, defaultPhase = GENERATE_RESOURCES, requiresDependencyResolution = COMPILE_PLUS_RUNTIME)
class GenerateSiteMojo : AbstractMojo() {

  companion object {
      const val GOAL = "generate-site"
  }

  override fun execute() {
    log.info("does something")
  }

}
