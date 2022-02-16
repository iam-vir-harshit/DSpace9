/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.nbevent;

import java.util.Date;

/**
 * This model class represent the notification broker source concept
 * 
 * @author Luca Giamminonni (luca.giamminonni at 4Science)
 *
 */
public class NBSource {
    private String name;
    private long totalEvents;
    private Date lastEvent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotalEvents() {
        return totalEvents;
    }

    public void setTotalEvents(long totalEvents) {
        this.totalEvents = totalEvents;
    }

    public Date getLastEvent() {
        return lastEvent;
    }

    public void setLastEvent(Date lastEvent) {
        this.lastEvent = lastEvent;
    }
}
