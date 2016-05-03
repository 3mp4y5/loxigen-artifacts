// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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


public class OFOxssVer13 implements OFOxss {
    public final static OFOxssVer13 INSTANCE = new OFOxssVer13();




    public OFOxsByteCount.Builder buildByteCount() {
        throw new UnsupportedOperationException("OFOxsByteCount not supported in version 1.3");
    }
    public OFOxsByteCount byteCount(U64 value) {
        throw new UnsupportedOperationException("OFOxsByteCount not supported in version 1.3");
    }

    public OFOxsDuration.Builder buildDuration() {
        throw new UnsupportedOperationException("OFOxsDuration not supported in version 1.3");
    }
    public OFOxsDuration duration(U64 value) {
        throw new UnsupportedOperationException("OFOxsDuration not supported in version 1.3");
    }

    public OFOxsFlowCount.Builder buildFlowCount() {
        throw new UnsupportedOperationException("OFOxsFlowCount not supported in version 1.3");
    }
    public OFOxsFlowCount flowCount(U32 value) {
        throw new UnsupportedOperationException("OFOxsFlowCount not supported in version 1.3");
    }

    public OFOxsIdleTime.Builder buildIdleTime() {
        throw new UnsupportedOperationException("OFOxsIdleTime not supported in version 1.3");
    }
    public OFOxsIdleTime idleTime(U64 value) {
        throw new UnsupportedOperationException("OFOxsIdleTime not supported in version 1.3");
    }

    public OFOxsPacketCount.Builder buildPacketCount() {
        throw new UnsupportedOperationException("OFOxsPacketCount not supported in version 1.3");
    }
    public OFOxsPacketCount packetCount(U64 value) {
        throw new UnsupportedOperationException("OFOxsPacketCount not supported in version 1.3");
    }

    public OFMessageReader<OFOxs<?>> getReader() {
        throw new UnsupportedOperationException("Reader<OFOxs<?>> not supported in version 1.3");
    }


    public OFVersion getVersion() {
            return OFVersion.OF_13;
    }
}
