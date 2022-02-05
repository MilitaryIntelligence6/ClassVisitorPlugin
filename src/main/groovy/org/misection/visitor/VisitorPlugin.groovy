package org.misection.visitor

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @ClassName MyGPlugin
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @Description TODO
 * @CreateTime 2022年02月05日 18:16:00
 */
public class VisitorPlugin implements Plugin<Project>{

    @Override
    public void apply(Project project) {
        println "hello, ${getClass().getName()}";
    }
}
