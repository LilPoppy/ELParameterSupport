package com.github.lilpoppy.elparametersupport.services

import com.intellij.openapi.project.Project
import com.github.lilpoppy.elparametersupport.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
