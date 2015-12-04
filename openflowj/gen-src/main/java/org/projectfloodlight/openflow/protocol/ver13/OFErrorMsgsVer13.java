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


public class OFErrorMsgsVer13 implements OFErrorMsgs {
    public final static OFErrorMsgsVer13 INSTANCE = new OFErrorMsgsVer13();

    private final XidGenerator xidGenerator = XidGenerators.global();



    public OFBadActionErrorMsg.Builder buildBadActionErrorMsg() {
        return new OFBadActionErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFBadRequestErrorMsg.Builder buildBadRequestErrorMsg() {
        return new OFBadRequestErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFFlowModFailedErrorMsg.Builder buildFlowModFailedErrorMsg() {
        return new OFFlowModFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFHelloFailedErrorMsg.Builder buildHelloFailedErrorMsg() {
        return new OFHelloFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFPortModFailedErrorMsg.Builder buildPortModFailedErrorMsg() {
        return new OFPortModFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFQueueOpFailedErrorMsg.Builder buildQueueOpFailedErrorMsg() {
        return new OFQueueOpFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFBadInstructionErrorMsg.Builder buildBadInstructionErrorMsg() {
        return new OFBadInstructionErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFBadMatchErrorMsg.Builder buildBadMatchErrorMsg() {
        return new OFBadMatchErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFGroupModFailedErrorMsg.Builder buildGroupModFailedErrorMsg() {
        return new OFGroupModFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFSwitchConfigFailedErrorMsg.Builder buildSwitchConfigFailedErrorMsg() {
        return new OFSwitchConfigFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFTableModFailedErrorMsg.Builder buildTableModFailedErrorMsg() {
        return new OFTableModFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFRoleRequestFailedErrorMsg.Builder buildRoleRequestFailedErrorMsg() {
        return new OFRoleRequestFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFBsnError.Builder buildBsnError() {
        return new OFBsnErrorVer13.Builder().setXid(nextXid());
    }

    public OFMeterModFailedErrorMsg.Builder buildMeterModFailedErrorMsg() {
        return new OFMeterModFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFTableFeaturesFailedErrorMsg.Builder buildTableFeaturesFailedErrorMsg() {
        return new OFTableFeaturesFailedErrorMsgVer13.Builder().setXid(nextXid());
    }

    public OFAsyncConfigFailedErrorMsg.Builder buildAsyncConfigFailedErrorMsg() {
        throw new UnsupportedOperationException("OFAsyncConfigFailedErrorMsg not supported in version 1.3");
    }

    public OFBadPropertyErrorMsg.Builder buildBadPropertyErrorMsg() {
        throw new UnsupportedOperationException("OFBadPropertyErrorMsg not supported in version 1.3");
    }

    public OFBundleFailedErrorMsg.Builder buildBundleFailedErrorMsg() {
        throw new UnsupportedOperationException("OFBundleFailedErrorMsg not supported in version 1.3");
    }

    public OFFlowMonitorFailedErrorMsg.Builder buildFlowMonitorFailedErrorMsg() {
        throw new UnsupportedOperationException("OFFlowMonitorFailedErrorMsg not supported in version 1.3");
    }

    public OFMessageReader<OFErrorMsg> getReader() {
        return OFErrorMsgVer13.READER;
    }

    public long nextXid() {
        return xidGenerator.nextXid();
    }

    public OFVersion getVersion() {
            return OFVersion.OF_13;
    }
}
