// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.hamcrest.CoreMatchers;



public class OFActionOutputVer13Test {
    OFActions factory;

    final static byte[] ACTION_OUTPUT_SERIALIZED =
        new byte[] { 0x0, 0x0, 0x0, 0x10, 0x0, 0x0, 0x0, 0x32, (byte) 0xff, (byte) 0xff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFActionsVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFActionOutput.Builder builder = factory.buildOutput();
        builder.setPort(OFPort.of(50)).setMaxLen(65535);
        OFActionOutput actionOutput = builder.build();
        ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
        actionOutput.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(ACTION_OUTPUT_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFActionOutput.Builder builder = factory.buildOutput();
        builder.setPort(OFPort.of(50)).setMaxLen(65535);
        OFActionOutput actionOutputBuilt = builder.build();

        ChannelBuffer input = ChannelBuffers.copiedBuffer(ACTION_OUTPUT_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFActionOutput actionOutputRead = OFActionOutputVer13.READER.readFrom(input);
        assertEquals(ACTION_OUTPUT_SERIALIZED.length, input.readerIndex());

        assertEquals(actionOutputBuilt, actionOutputRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(ACTION_OUTPUT_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFActionOutput actionOutput = OFActionOutputVer13.READER.readFrom(input);
       assertEquals(ACTION_OUTPUT_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       actionOutput.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(ACTION_OUTPUT_SERIALIZED));
   }

}
