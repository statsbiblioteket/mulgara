/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is the Kowari Metadata Store.
 *
 * The Initial Developer of the Original Code is Plugged In Software Pty
 * Ltd (http://www.pisoftware.com, mailto:info@pisoftware.com). Portions
 * created by Plugged In Software Pty Ltd are Copyright (C) 2001,2002
 * Plugged In Software Pty Ltd. All Rights Reserved.
 *
 * Contributor(s): N/A.
 *
 * [NOTE: The text of this Exhibit A may differ slightly from the text
 * of the notices in the Source Code files of the Original Code. You
 * should use the text of this Exhibit A rather than the text found in the
 * Original Code Source Code for Your Modifications.]
 *
 */

package org.mulgara.store;

/**
 * Base class for exceptions thrown by triple store interfaces.
 *
 * @created 2001-10-05
 *
 * @author <a href="http://staff.pisoftware.com/raboczi">Simon Raboczi</a>
 *
 * @version $Revision: 1.1 $
 *
 * @modified $Date: 2005/02/22 08:16:39 $
 *
 * @maintenanceAuthor $Author: newmana $
 *
 * @company <A href="mailto:info@PIsoftware.com">Plugged In Software</A>
 *
 * @copyright &copy; 2001-2004 <A href="http://www.pisoftware.com/">Plugged In
 *      Software Pty Ltd</A>
 *
 * @licence <a href="{@docRoot}/../../LICENCE">Mozilla Public License v1.1</a>
 */
public class StoreException extends Exception {

  /**
   * CONSTRUCTOR StoreException TO DO
   *
   * @param message PARAMETER TO DO
   */
  public StoreException(String message) {
    super(message);
  }

  /**
   * CONSTRUCTOR StoreException TO DO
   *
   * @param message PARAMETER TO DO
   * @param cause PARAMETER TO DO
   */
  public StoreException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * CONSTRUCTOR StoreException TO DO
   *
   * @param cause PARAMETER TO DO
   */
  public StoreException(Throwable cause) {
    super(cause);
  }
}
