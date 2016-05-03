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
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFOxmBsnGlobalVrfAllowedVer13Test {
    OFOxms factory;

    final static byte[] OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED =
        new byte[] { 0x0, 0x3, 0x6, 0x1, 0x1 };

    @Before
    public void setup() {
        factory = OFOxmsVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFOxmBsnGlobalVrfAllowed.Builder builder = factory.buildBsnGlobalVrfAllowed();
        builder.setValue(OFBooleanValue.TRUE);
        OFOxmBsnGlobalVrfAllowed oxmBsnGlobalVrfAllowed = builder.build();
        ByteBuf bb = Unpooled.buffer();
        oxmBsnGlobalVrfAllowed.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFOxmBsnGlobalVrfAllowed.Builder builder = factory.buildBsnGlobalVrfAllowed();
        builder.setValue(OFBooleanValue.TRUE);
        OFOxmBsnGlobalVrfAllowed oxmBsnGlobalVrfAllowedBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFOxmBsnGlobalVrfAllowed oxmBsnGlobalVrfAllowedRead = OFOxmBsnGlobalVrfAllowedVer13.READER.readFrom(input);
        assertEquals(OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED.length, input.readerIndex());

        assertEquals(oxmBsnGlobalVrfAllowedBuilt, oxmBsnGlobalVrfAllowedRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFOxmBsnGlobalVrfAllowed oxmBsnGlobalVrfAllowed = OFOxmBsnGlobalVrfAllowedVer13.READER.readFrom(input);
       assertEquals(OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       oxmBsnGlobalVrfAllowed.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(OXM_BSN_GLOBAL_VRF_ALLOWED_SERIALIZED));
   }

}
