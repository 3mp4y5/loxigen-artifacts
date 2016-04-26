// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFMeterStatsReplyVer15Test {
    OFFactory factory;

    final static byte[] METER_STATS_REPLY_SERIALIZED =
        new byte[] { 0x6, 0x13, 0x0, 0x58, 0x12, 0x34, 0x56, 0x78, 0x0, 0x9, 0x0, 0x1, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x48, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xa, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xa, 0x0, 0x0, 0x0, 0x3, (byte) 0xb2, (byte) 0xd0, 0x5e, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xa, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xb, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xc, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xd };

    @Before
    public void setup() {
        factory = OFFactoryVer15.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFMeterStatsReply.Builder builder = factory.buildMeterStatsReply();
        builder
        .setXid(0x12345678)
        .setFlags(ImmutableSet.<OFStatsReplyFlags>of(OFStatsReplyFlags.REPLY_MORE))
        .setEntries(ImmutableList.<OFMeterStats>of(factory.buildMeterStats().setMeterId(1)
                                                                            .setRefCount(1)
                                                                            .setPacketInCount(U64.of(10))
                                                                            .setByteInCount(U64.of(10))
                                                                            .setDurationSec(3)
                                                                            .setDurationNsec(3000000000L)
                                                                            .setBandStats(ImmutableList.<OFMeterBandStats>of(factory.buildMeterBandStats().setPacketBandCount(U64.of(10))
                                                                                                                                                            .setByteBandCount(U64.of(11))
                                                                                                                                                            .build(),
                                                                                                                            factory.buildMeterBandStats().setPacketBandCount(U64.of(12))
                                                                                                                                                            .setByteBandCount(U64.of(13))
                                                                                                                                                            .build()))
                                                                            .build()))
        .build();
        OFMeterStatsReply meterStatsReply = builder.build();
        ByteBuf bb = Unpooled.buffer();
        meterStatsReply.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(METER_STATS_REPLY_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFMeterStatsReply.Builder builder = factory.buildMeterStatsReply();
        builder
        .setXid(0x12345678)
        .setFlags(ImmutableSet.<OFStatsReplyFlags>of(OFStatsReplyFlags.REPLY_MORE))
        .setEntries(ImmutableList.<OFMeterStats>of(factory.buildMeterStats().setMeterId(1)
                                                                            .setRefCount(1)
                                                                            .setPacketInCount(U64.of(10))
                                                                            .setByteInCount(U64.of(10))
                                                                            .setDurationSec(3)
                                                                            .setDurationNsec(3000000000L)
                                                                            .setBandStats(ImmutableList.<OFMeterBandStats>of(factory.buildMeterBandStats().setPacketBandCount(U64.of(10))
                                                                                                                                                            .setByteBandCount(U64.of(11))
                                                                                                                                                            .build(),
                                                                                                                            factory.buildMeterBandStats().setPacketBandCount(U64.of(12))
                                                                                                                                                            .setByteBandCount(U64.of(13))
                                                                                                                                                            .build()))
                                                                            .build()))
        .build();
        OFMeterStatsReply meterStatsReplyBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(METER_STATS_REPLY_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFMeterStatsReply meterStatsReplyRead = OFMeterStatsReplyVer15.READER.readFrom(input);
        assertEquals(METER_STATS_REPLY_SERIALIZED.length, input.readerIndex());

        assertEquals(meterStatsReplyBuilt, meterStatsReplyRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(METER_STATS_REPLY_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFMeterStatsReply meterStatsReply = OFMeterStatsReplyVer15.READER.readFrom(input);
       assertEquals(METER_STATS_REPLY_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       meterStatsReply.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(METER_STATS_REPLY_SERIALIZED));
   }

}
