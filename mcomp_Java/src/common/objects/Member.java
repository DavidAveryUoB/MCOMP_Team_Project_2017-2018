package common.objects;

import java.rmi.RemoteException;
import java.util.ArrayList;
import common.datatypes.Ability;
import common.interfaces.Leadable;
import common.interfaces.Membership;
import common.interfaces.Rmiable;

/**
 * 
 * @author Stephen Pope 15836791
 * @author Ryan Shoobert (15812407)
 * 
 * A test Member Class.
 *
 * A Member must be handed a public Key from the leader of the Herd..
 * A Member must have a List of abilities that are of use to the Herd.
 * A Member cannot join or leave a herd. A leader handles the transition.
 * A Member must be able to start the Leader process when nominated.
 * 
 */

public class Member implements Rmiable, Membership {
	private ArrayList<Ability> abilities;
	private String herdID = null;
	private String publicKey;

	/**
	 * The Constructor for a Member.
	 *
	 * A new Member will come with a list of abilities.
	 * 
	 * These abilities are parsed by the constructor and
	 * used to initialise the controllers for those abilities.
	 * 
	 * A member then initialises a Herd, becoming that Herds
	 * first member.
	 * 
	 * @param The list containing the Members abilities.
	 * @return A new Member object.
	 */

	public Member (Ability[] can) {
		abilities = new ArrayList<Ability>();

		for(Ability a : can) {
			switch (a) {
			case PROCESSOR:
				abilities.add(a);
				break;
			case DRIVER:
				abilities.add(a);
				break;
			case SENSOR:
				abilities.add(a);
				break;
			case VIEWER:
				abilities.add(a);
				break;
			case DEST_SETTER:
				abilities.add(a);
				break;
			default: break;
			}
		}		
	}


	/**
	 * Retrieves a list of the Members abilities.
	 * 
	 * @return The ability list.
	 */
	@Override
	public ArrayList<Ability> getAbilities(){
		return abilities;
	}

	/**
	 * Sets the value of publicKey when handed by a leader.
	 * 
	 * @param The Public key of a leader.
	 */
	
	@Override
	public boolean setPublicKey(String pk) {
		if (isValidKey(pk)) {
			publicKey = pk;
			return true;
		}
		else return false;		
	}


	/**
	 * Retrieves the Public Encryption Key of the Member.
	 * 
	 * @return The Public Key.
	 */
	public String getPublicKey() {
		return publicKey; //TODO this needs to be of type Key once I work out ciphers.
	}
	
	/**
	 * Validates that the provided Public Key given by a leader
	 * can be used to securely communicate with the leader.
	 * 
	 * @param pk
	 * @return True if key is valid, false if not.
	 */
	private boolean isValidKey(String pk) {
		// TODO RMI call leader, encrpyt String hello world to Leader, if leader returns Hello World then true.
		return false;
	}

	/**
	 * Retrieves the HerdID of the Herd that this Member
	 * has joined.
	 * 
	 * @return The HerdID.
	 */
	public String getHerdID() {
		return herdID;
	}

	/**
	 * Sets the ID of the Herd this Member has joined.
	 * 
	 * @param The new HerdID.
	 */
	public void setHerdID(String newID) {
		/*TODO Write a check to ensure that the 
		 * change of ID is valid. Perhaps contact
		 * the Herd ID supplied. Perhaps ensure that
		 * the Herd is the only one able to change this.
		 */
		herdID = newID;
	}


	@Override
	public int add(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		//Leftover from RMIable testing.
		return 0;
	}


	public void start() {
		// TODO Auto-generated method stub

	}
}

