/**
 * 
 */
package common.interfaces;

import common.datatypes.map.Map;

/**
 * @author David Avery
 *
 */
public interface LiDARable {
  //TODO currently a shim for the pass over to arduino... consider: wrapping serial?? refactoring??
  Map sense();//FIXME

}