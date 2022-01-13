package com.github.ihipi.dddhelper.services

import com.intellij.openapi.project.Project
import com.github.ihipi.dddhelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
