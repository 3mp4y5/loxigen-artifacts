// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.Set;
import java.util.List;
import io.netty.buffer.ByteBuf;

public interface OFPortDesc extends OFObject {
    OFPort getPortNo();
    MacAddress getHwAddr();
    String getName();
    Set<OFPortConfig> getConfig();
    Set<OFPortState> getState();
    Set<OFPortFeatures> getCurr() throws UnsupportedOperationException;
    Set<OFPortFeatures> getAdvertised() throws UnsupportedOperationException;
    Set<OFPortFeatures> getSupported() throws UnsupportedOperationException;
    Set<OFPortFeatures> getPeer() throws UnsupportedOperationException;
    long getCurrSpeed() throws UnsupportedOperationException;
    long getMaxSpeed() throws UnsupportedOperationException;
    List<OFPortDescProp> getProperties() throws UnsupportedOperationException;
    OFVersion getVersion();
    // Additional methods

    /**
     * Returns true if the port is up, i.e., it's neither administratively
     * down nor link down. It currently does NOT take STP state into
     * consideration
     * @return whether the port is up
     */
    boolean isEnabled();

    /**
     * Returns the current generation ID of this port.
     *
     * The generationId is reported by the switch as a @{link OFPortDescProp} in
     * @link{OFPortDescStatsReply} and @link{OFPortStatus} messages. If the
     * current OFPortDesc does not contain a generation Id, returns U64.ZERO;
     *
     * For OpenFlow versions earlier than 1.4, always returns U64.ZERO;
     *
     * @return the generation ID or U64.ZERO if not reported
     * @since 1.4
     */
     public U64 getBsnGenerationId();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder  {
        OFPortDesc build();
        OFPort getPortNo();
        Builder setPortNo(OFPort portNo);
        MacAddress getHwAddr();
        Builder setHwAddr(MacAddress hwAddr);
        String getName();
        Builder setName(String name);
        Set<OFPortConfig> getConfig();
        Builder setConfig(Set<OFPortConfig> config);
        Set<OFPortState> getState();
        Builder setState(Set<OFPortState> state);
        Set<OFPortFeatures> getCurr() throws UnsupportedOperationException;
        Builder setCurr(Set<OFPortFeatures> curr) throws UnsupportedOperationException;
        Set<OFPortFeatures> getAdvertised() throws UnsupportedOperationException;
        Builder setAdvertised(Set<OFPortFeatures> advertised) throws UnsupportedOperationException;
        Set<OFPortFeatures> getSupported() throws UnsupportedOperationException;
        Builder setSupported(Set<OFPortFeatures> supported) throws UnsupportedOperationException;
        Set<OFPortFeatures> getPeer() throws UnsupportedOperationException;
        Builder setPeer(Set<OFPortFeatures> peer) throws UnsupportedOperationException;
        long getCurrSpeed() throws UnsupportedOperationException;
        Builder setCurrSpeed(long currSpeed) throws UnsupportedOperationException;
        long getMaxSpeed() throws UnsupportedOperationException;
        Builder setMaxSpeed(long maxSpeed) throws UnsupportedOperationException;
        List<OFPortDescProp> getProperties() throws UnsupportedOperationException;
        Builder setProperties(List<OFPortDescProp> properties) throws UnsupportedOperationException;
        OFVersion getVersion();
    }
}
