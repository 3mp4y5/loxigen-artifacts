// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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

abstract class OFGroupModVer15 {
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 24;


    public final static OFGroupModVer15.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFGroupMod> {
        @Override
        public OFGroupMod readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 15
            byte type = bb.readByte();
            if(type != (byte) 0xf)
                throw new OFParseError("Wrong type: Expected=OFType.GROUP_MOD(15), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            short command = bb.readShort();
            bb.readerIndex(start);
            switch(command) {
               case (short) 0x0:
                   // discriminator value OFGroupModCommand.ADD=0 for class OFGroupAddVer15
                   return OFGroupAddVer15.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value OFGroupModCommand.DELETE=2 for class OFGroupDeleteVer15
                   return OFGroupDeleteVer15.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFGroupModCommand.MODIFY=1 for class OFGroupModifyVer15
                   return OFGroupModifyVer15.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFGroupModCommand.INSERT_BUCKET=3 for class OFGroupInsertBucketVer15
                   return OFGroupInsertBucketVer15.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFGroupModCommand.REMOVE_BUCKET=5 for class OFGroupRemoveBucketVer15
                   return OFGroupRemoveBucketVer15.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator command of class OFGroupModVer15: " + command);
            }
        }
    }
}
