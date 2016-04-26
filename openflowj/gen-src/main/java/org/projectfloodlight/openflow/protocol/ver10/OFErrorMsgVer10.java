// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import io.netty.buffer.ByteBuf;

abstract class OFErrorMsgVer10 {
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 10;


    public final static OFErrorMsgVer10.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFErrorMsg> {
        @Override
        public OFErrorMsg readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 1
            byte type = bb.readByte();
            if(type != (byte) 0x1)
                throw new OFParseError("Wrong type: Expected=OFType.ERROR(1), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            short errType = bb.readShort();
            bb.readerIndex(start);
            switch(errType) {
               case (short) 0x2:
                   // discriminator value OFErrorType.BAD_ACTION=2 for class OFBadActionErrorMsgVer10
                   return OFBadActionErrorMsgVer10.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFErrorType.BAD_REQUEST=1 for class OFBadRequestErrorMsgVer10
                   return OFBadRequestErrorMsgVer10.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFErrorType.FLOW_MOD_FAILED=3 for class OFFlowModFailedErrorMsgVer10
                   return OFFlowModFailedErrorMsgVer10.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFErrorType.HELLO_FAILED=0 for class OFHelloFailedErrorMsgVer10
                   return OFHelloFailedErrorMsgVer10.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value OFErrorType.PORT_MOD_FAILED=4 for class OFPortModFailedErrorMsgVer10
                   return OFPortModFailedErrorMsgVer10.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFErrorType.QUEUE_OP_FAILED=5 for class OFQueueOpFailedErrorMsgVer10
                   return OFQueueOpFailedErrorMsgVer10.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator errType of class OFErrorMsgVer10: " + errType);
            }
        }
    }
}
