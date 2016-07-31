/**
 * 
 */
package com.dsleng.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * @author suresh
 *
 */
class Simple extends DefaultTask {
	@TaskAction
	def showMessage() {
			println '----------SimpleTask-------------'
	}
	
}
