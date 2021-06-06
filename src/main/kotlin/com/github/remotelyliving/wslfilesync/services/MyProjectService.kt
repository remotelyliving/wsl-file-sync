package com.github.remotelyliving.wslfilesync.services

import com.github.remotelyliving.wslfilesync.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
