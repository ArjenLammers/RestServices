// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.RestServices;
import restservices.consume.RestConsumer;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * Use this header to provide an eTag. If the resource requested is not modified, the servier might respond with a 304 Not Modified response, instead of sending the data. 
 * 
 * This saves resources of both the client and server. 
 */
public class addIfNoneMatchHeader extends UserAction<Boolean>
{
	private String eTag;

	public addIfNoneMatchHeader(String eTag)
	{
		super();
		this.eTag = eTag;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RestConsumer.useETagInNextRequest(eTag);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "addIfNoneMatchHeader";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}