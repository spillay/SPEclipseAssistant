/**
 * 
 */
package com.dsleng.gradle



import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import com.dsleng.gradle.tasks.Simple
import static org.junit.Assert.*


/**
 * @author suresh
 *
 */
class SPEclipseGenTest {
	@Test
	public void simplePluginTest() {
		Project project = ProjectBuilder.builder().build()
		//project.pluginManager.apply 'java'
		
		project.pluginManager.apply 'com.dsleng.gradle.SPEclipseGenerator'
		//project.tasks.all(it -> println it)
		assertTrue(project.tasks.sp instanceof Simple)
	}
}