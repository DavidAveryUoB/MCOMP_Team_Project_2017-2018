package common.interfaces;

import java.rmi.RemoteException;
import common.datatypes.Waypoint;

/**
 * @author Stephen Pope 15836791
 * @author David Avery 15823926
 * @author Ryan Shoobert 15812407
 * @author Harry Jackson 14812630
 * 
 *         Directable interface
 * 
 *         A directable object is one that can accept input that defines a final goal or destination
 *         for the Herd to attempt to pathfind to.
 */

public interface Directable extends RemoteMember, RemoteLeader {

  public boolean setDestination(Waypoint w) throws RemoteException;

}
