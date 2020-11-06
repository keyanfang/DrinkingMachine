/** Generated by YAKINDU Statechart Tools code generator. */
package fr.univcotedazur.polytech.si4.fsm.project;

/**
* Interface for state machines which use timed event triggers.
*/
public interface ITimerCallback {
	
	/**
	* Callback method if a time event occurred.
	* 
	* @param eventID
	* 			:The id of the occurred event.
	*/
	public void timeElapsed(int eventID);
}
