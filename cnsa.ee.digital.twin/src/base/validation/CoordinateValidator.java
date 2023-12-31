/**
 *
 * $Id$
 */
package base.validation;


/**
 * A sample validator interface for {@link base.Coordinate}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CoordinateValidator {
	boolean validate();

	boolean validateX(float value);
	boolean validateY(float value);
	boolean validateZ(float value);
}
