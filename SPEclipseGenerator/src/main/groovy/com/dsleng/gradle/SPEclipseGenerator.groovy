/**
 * 
 */
package com.dsleng.gradle

/**
 * @author suresh
 *
 */
import org.gradle.api.*;
import com.dsleng.gradle.tasks.Simple;

class SPEclipseGenerator implements Plugin {

	@Override
	public void apply(Object project) {
		project.task('sp',type:Simple)
	}

}
