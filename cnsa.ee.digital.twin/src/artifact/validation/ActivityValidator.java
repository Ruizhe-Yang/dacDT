/**
 *
 * $Id$
 */
package artifact.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link artifact.Activity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityValidator {
	boolean validate();

	boolean validateStartTime(Date value);
	boolean validateEndTime(Date value);
}