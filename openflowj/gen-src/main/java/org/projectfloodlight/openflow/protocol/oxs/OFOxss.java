// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol.oxs;

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

public interface OFOxss {
    // Subfactories

    OFOxsByteCount.Builder buildByteCount() throws UnsupportedOperationException;
    OFOxsByteCount byteCount(U64 value);
    OFOxsByteCountMasked.Builder buildByteCountMasked() throws UnsupportedOperationException;
    OFOxsByteCountMasked byteCountMasked(U64 value, U64 mask);
    OFOxsDuration.Builder buildDuration() throws UnsupportedOperationException;
    OFOxsDuration duration(U64 value);
    OFOxsDurationMasked.Builder buildDurationMasked() throws UnsupportedOperationException;
    OFOxsDurationMasked durationMasked(U64 value, U64 mask);
    OFOxsFlowCount.Builder buildFlowCount() throws UnsupportedOperationException;
    OFOxsFlowCount flowCount(U32 value);
    OFOxsFlowCountMasked.Builder buildFlowCountMasked() throws UnsupportedOperationException;
    OFOxsFlowCountMasked flowCountMasked(U32 value, U32 mask);
    OFOxsIdleTime.Builder buildIdleTime() throws UnsupportedOperationException;
    OFOxsIdleTime idleTime(U64 value);
    OFOxsIdleTimeMasked.Builder buildIdleTimeMasked() throws UnsupportedOperationException;
    OFOxsIdleTimeMasked idleTimeMasked(U64 value, U64 mask);
    OFOxsPacketCount.Builder buildPacketCount() throws UnsupportedOperationException;
    OFOxsPacketCount packetCount(U64 value);
    OFOxsPacketCountMasked.Builder buildPacketCountMasked() throws UnsupportedOperationException;
    OFOxsPacketCountMasked packetCountMasked(U64 value, U64 mask);

    OFMessageReader<OFOxs<?>> getReader();
    OFVersion getVersion();
}
