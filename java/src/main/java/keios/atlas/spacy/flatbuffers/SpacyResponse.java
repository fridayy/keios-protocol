// automatically generated by the FlatBuffers compiler, do not modify

package keios.atlas.spacy.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SpacyResponse extends Table {
  public static SpacyResponse getRootAsSpacyResponse(ByteBuffer _bb) { return getRootAsSpacyResponse(_bb, new SpacyResponse()); }
  public static SpacyResponse getRootAsSpacyResponse(ByteBuffer _bb, SpacyResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public SpacyResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public DEPSpacyResponse dep() { return dep(new DEPSpacyResponse()); }
  public DEPSpacyResponse dep(DEPSpacyResponse obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public NERSpacyResponse ner() { return ner(new NERSpacyResponse()); }
  public NERSpacyResponse ner(NERSpacyResponse obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createSpacyResponse(FlatBufferBuilder builder,
      int depOffset,
      int nerOffset) {
    builder.startObject(2);
    SpacyResponse.addNer(builder, nerOffset);
    SpacyResponse.addDep(builder, depOffset);
    return SpacyResponse.endSpacyResponse(builder);
  }

  public static void startSpacyResponse(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addDep(FlatBufferBuilder builder, int depOffset) { builder.addOffset(0, depOffset, 0); }
  public static void addNer(FlatBufferBuilder builder, int nerOffset) { builder.addOffset(1, nerOffset, 0); }
  public static int endSpacyResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishSpacyResponseBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedSpacyResponseBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

