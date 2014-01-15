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
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;


public class OFInstructionIdsVer13 implements OFInstructionIds {
    public final static OFInstructionIdsVer13 INSTANCE = new OFInstructionIdsVer13();




    public OFInstructionIdApplyActions applyActions() {
        return OFInstructionIdApplyActionsVer13.INSTANCE;
    }

    public OFInstructionIdBsnArpOffload bsnArpOffload() {
        return OFInstructionIdBsnArpOffloadVer13.INSTANCE;
    }

    public OFInstructionIdBsnDisableSrcMacCheck bsnDisableSrcMacCheck() {
        return OFInstructionIdBsnDisableSrcMacCheckVer13.INSTANCE;
    }

    public OFInstructionIdClearActions clearActions() {
        return OFInstructionIdClearActionsVer13.INSTANCE;
    }

    public OFInstructionIdGotoTable gotoTable() {
        return OFInstructionIdGotoTableVer13.INSTANCE;
    }

    public OFInstructionIdMeter meter() {
        return OFInstructionIdMeterVer13.INSTANCE;
    }

    public OFInstructionIdWriteActions writeActions() {
        return OFInstructionIdWriteActionsVer13.INSTANCE;
    }

    public OFInstructionIdWriteMetadata writeMetadata() {
        return OFInstructionIdWriteMetadataVer13.INSTANCE;
    }

    public OFMessageReader<OFInstructionId> getReader() {
        return OFInstructionIdVer13.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_13;
    }
}
