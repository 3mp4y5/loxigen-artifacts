// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import org.jboss.netty.buffer.ChannelBuffer;
import java.util.Set;

abstract class OFActionVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 8;


    public final static OFActionVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFAction> {
        @Override
        public OFAction readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0xffff:
                   // discriminator value OFActionType.EXPERIMENTER=65535 for class OFActionExperimenterVer13
                   return OFActionExperimenterVer13.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFActionType.OUTPUT=0 for class OFActionOutputVer13
                   return OFActionOutputVer13.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value OFActionType.COPY_TTL_IN=12 for class OFActionCopyTtlInVer13
                   return OFActionCopyTtlInVer13.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value OFActionType.COPY_TTL_OUT=11 for class OFActionCopyTtlOutVer13
                   return OFActionCopyTtlOutVer13.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value OFActionType.DEC_MPLS_TTL=16 for class OFActionDecMplsTtlVer13
                   return OFActionDecMplsTtlVer13.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value OFActionType.DEC_NW_TTL=24 for class OFActionDecNwTtlVer13
                   return OFActionDecNwTtlVer13.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value OFActionType.GROUP=22 for class OFActionGroupVer13
                   return OFActionGroupVer13.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value OFActionType.POP_MPLS=20 for class OFActionPopMplsVer13
                   return OFActionPopMplsVer13.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value OFActionType.POP_VLAN=18 for class OFActionPopVlanVer13
                   return OFActionPopVlanVer13.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value OFActionType.PUSH_MPLS=19 for class OFActionPushMplsVer13
                   return OFActionPushMplsVer13.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value OFActionType.PUSH_VLAN=17 for class OFActionPushVlanVer13
                   return OFActionPushVlanVer13.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value OFActionType.SET_MPLS_TTL=15 for class OFActionSetMplsTtlVer13
                   return OFActionSetMplsTtlVer13.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value OFActionType.SET_NW_TTL=23 for class OFActionSetNwTtlVer13
                   return OFActionSetNwTtlVer13.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value OFActionType.SET_QUEUE=21 for class OFActionSetQueueVer13
                   return OFActionSetQueueVer13.READER.readFrom(bb);
               case (short) 0x19:
                   // discriminator value OFActionType.SET_FIELD=25 for class OFActionSetFieldVer13
                   return OFActionSetFieldVer13.READER.readFrom(bb);
               case (short) 0x1b:
                   // discriminator value OFActionType.POP_PBB=27 for class OFActionPopPbbVer13
                   return OFActionPopPbbVer13.READER.readFrom(bb);
               case (short) 0x1a:
                   // discriminator value OFActionType.PUSH_PBB=26 for class OFActionPushPbbVer13
                   return OFActionPushPbbVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFActionVer13: " + type);
            }
        }
    }
}
