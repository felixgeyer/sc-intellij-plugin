package com.github.felixgeyer.scintellijplugin.services

import com.github.felixgeyer.scintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
