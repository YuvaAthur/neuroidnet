package Base;

/**
 * Concept.java
 *
 *
 * Created: Mon Mar 19 22:42:50 2001
 *
 * @author Cengiz Gunay
 * @version
 */

public interface Concept {
    /**
     * Attaches the presynaptic neuroid to <code>concept</code>.
     *
     * @param neuroid a <code>Neuroid</code> value
     */
    void attach(Neuroid neuroid);

    /**
     * Detaches the presynaptic neuroid from <code>concept</code>.
     *
     * @param neuroid a <code>Neuroid</code> value
     */
    void detach(Neuroid neuroid);

    
    /**
     * Fire the neuroids associated with the <code>Concept</code>. 
     * TODO: 
     */
    void fire();

    /**
     * Dump synaptic activity to output (file?). TO DO: do it!
     *
     */
    void dumpData();
}// Concept
